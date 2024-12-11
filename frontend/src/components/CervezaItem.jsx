import React from 'react';

function CervezaItem({ cerveza }) {
    return (
        <div>
            <h3>Nombre : {cerveza.nombre}</h3>
            <p>Precio : {cerveza.precio}</p>
            <p>Porcentaje: {cerveza.porcentaje}</p>
            <p>ID del proveedor: {cerveza.proveedor_id}</p>
            <p>ID del estilo: {cerveza.estilo_id}</p>
        </div>
    )
}
export default CervezaItem;