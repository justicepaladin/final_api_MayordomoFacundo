import { useState, useEffect } from 'react';
import axiosClient from './axiosClient';

function useCervezas() {
    const [cervezas, setCervezas] = useState([]);
    const [error] = useState(null);

    useEffect(() => {
        const fetchCervezas = async () => {
            try {
                const response = await axiosClient.get(`/cerveza/todas`);
                setCervezas(response.data);
            } catch (error) {
                console.log("Error al cargar las cervezas");
            }
        };
        fetchCervezas();
    }, []);

    return { cervezas, error };

}

export default useCervezas;