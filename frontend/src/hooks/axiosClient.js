import axios from "axios";

const axiosClient = axios.create({
    baseURL: "http://localhost:8080/", 
    timeout: 10000, 
});

/** Esto no es necesario ya que no se usa inicio de sesion, lo utilicé de mi TPO
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

*/

export default axiosClient;