import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import axios from "axios";
import CreateCervezaForm from "./Components/CervezaForm";
function App() {
  return (
    <>
      <h1>Mis cervezas</h1>
      <CreateCervezaForm></CreateCervezaForm>
    </>
  );
}

export default App;
