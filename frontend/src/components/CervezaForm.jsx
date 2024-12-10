import React, { useState } from 'react';

function CervezaForm() {
    const [nombre, setNombre] = useState('');
    const [precio, setPrecio] = useState('');
    const [porcentaje, setPorcentaje] = useState('');
    const [proveedor_id, setProveedor_id] = useState('');
    const [estilo_id, setEstilo_id] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        console.log(nombre, precio, porcentaje, proveedor_id, estilo_id);
    }

    return (
        <div>
            <h1>Formulario de Cerveza</h1>
            <form onSubmit={handleSubmit}>
                <label>Nombre</label>
                <input type="text" value={nombre} onChange={(e) => setNombre(e.target.value)} />
                <label>Precio</label>
                <input type="text" value={precio} onChange={(e) => setPrecio(e.target.value)} />
                <label>Porcentaje</label>
                <input type="text" value={porcentaje} onChange={(e) => setPorcentaje(e.target.value)} />
                <label>Proveedor</label>
                <input type="text" value={proveedor_id} onChange={(e) => setProveedor_id(e.target.value)} />
                <label>Estilo</label>
                <input type="text" value={estilo_id} onChange={(e) => setEstilo_id(e.target.value)} />
                <button type="submit">Agregar Cerveza</button>
            </form>
        </div>
    )
}

export default CervezaForm;