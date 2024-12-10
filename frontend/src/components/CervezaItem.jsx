import React from 'react';

function CervezaItem({ cerveza }) {
    return (
        <div>
            <h3>{cerveza.nombre}</h3>
            <p>{cerveza.precio}</p>
            <p>{cerveza.porcentaje}</p>
            <p>{cerveza.proveedor_id}</p>
            <p>{cerveza.estilo_id}</p>
        </div>
    )
}
export default CervezaItem;