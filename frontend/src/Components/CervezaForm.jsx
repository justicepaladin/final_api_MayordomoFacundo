import React, { useState, useEffect } from "react";
import axios from "../Config/axios";

const CreateCervezaForm = () => {
  const [formData, setFormData] = useState({
    nombre: "",
    precio: "",
    porcentajeAlcohol: "",
    proveedor_id: "",
    estilo_id: "",
  });

  const [estilos, setEstilos] = useState([]);
  const [proveedores, setProveedores] = useState([]);

  useEffect(() => {
    axios
      .get("/estilos")
      .then((response) => {
        console.log("Estilos cargados:", response.data);
        setEstilos(response.data);
      })
      .catch((error) => console.error("Error al cargar estilos:", error));

    axios
      .get("/proveedor")
      .then((response) => {
        console.log("Proveedores cargados:", response.data);
        setProveedores(response.data);
      })
      .catch((error) => console.error("Error al cargar proveedores:", error));
  }, []);

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    axios
      .post("/cerveza", formData)
      .then((response) => {
        console.log("Cerveza creada:", response.data);
        setFormData({
          nombre: "",
          precio: "",
          porcentajeAlcohol: "",
          proveedor_id: "",
          estilo_id: "",
        });
      })
      .catch((error) => console.error("Error al crear cerveza:", error));
  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="nombre"
          placeholder="Nombre"
          value={formData.nombre}
          onChange={handleInputChange}
        />
        <input
          type="number"
          name="precio"
          placeholder="Precio"
          value={formData.precio}
          onChange={handleInputChange}
        />
        <input
          type="number"
          name="porcentajeAlcohol"
          placeholder="Graduación"
          step="0.1"
          value={formData.porcentajeAlcohol}
          onChange={handleInputChange}
        />
        <select
          name="proveedor_id"
          value={formData.proveedor_id}
          onChange={handleInputChange}
        >
          <option value="">Seleccione un proveedor</option>
          {proveedores.map((proveedor) => (
            <option key={proveedor.id} value={proveedor.id}>
              {proveedor.nombre}
            </option>
          ))}
        </select>
        <select
          name="estilo_id"
          value={formData.estilo_id}
          onChange={handleInputChange}
        >
          <option value="">Seleccione un estilo</option>
          {estilos.map((estilo) => (
            <option key={estilo.id} value={estilo.id}>
              {estilo.Nombre}
            </option>
          ))}
        </select>
        <button type="submit">Añadir</button>
      </form>
    </div>
  );
};

export default CreateCervezaForm;
