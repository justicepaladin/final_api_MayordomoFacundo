import axios from "axios";

const axiosClient = axios.create({
    baseURL: "http://localhost:8080/", 
    timeout: 10000, 
});


axiosClient.interceptors.request.use(
    (config) => {
        const token = localStorage.getItem("jwtToken");
        if (token) {
            config.headers.Authorization = `Bearer ${token}`;
        }
        return config;
    },
    (error) => {
        return Promise.reject(error);
    }
);

export default axiosClient;