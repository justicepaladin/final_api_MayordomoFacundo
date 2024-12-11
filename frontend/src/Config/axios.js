import axios from "axios";

// Crea una instancia de Axios con configuración básica
const axiosInstance = axios.create({
  baseURL: "http://localhost:8080", // Cambia esto por la URL base de tu backend
  headers: {
    "Content-Type": "application/json",
  },
});

export default axiosInstance;
