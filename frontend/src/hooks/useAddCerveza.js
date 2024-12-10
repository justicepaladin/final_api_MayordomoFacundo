import { useState, useEffect } from 'react';
import axiosClient from './axiosClient';

function AddCerveza()
{
    const nueva = async(nombre,precio,porcentaje,proveedor_id,estilo_id) => {
        try {
            const response = await axiosClient.post(`/cerveza/nueva`, {nombre,precio,porcentaje,proveedor_id,estilo_id});
            return response.data;
        } catch (error) {
            console.log("Error al cargar las cervezas");
        }
    }
}

export default AddCerveza;