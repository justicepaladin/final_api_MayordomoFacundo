import { useState } from 'react'
import './App.css'
import axiosClient from './hooks/axiosClient'
import useCervezas from './hooks/useCervezas'
import useAddCerveza from './hooks/useAddCerveza'
import CervezaList from './components/CervezaList'
import CervezaForm from './components/CervezaForm'

function App() {

  const { cervezas, error } = useCervezas()
  const { nueva } = useAddCerveza()
  const [showForm, setShowForm] = useState(false)

  const toggleForm = () => {
    setShowForm(!showForm)
  }

  return (
    <div className="App">
      <h1>Lista de Cervezas</h1>
      {error && <p>Error: {error}</p>}
      <CervezaList cervezas={cervezas} />
      <button onClick={toggleForm}>
        {showForm ? 'Ocultar Formulario' : 'Agregar Cerveza'}
      </button>
      {showForm && <CervezaForm onAddCerveza={nueva} />}
     
    </div>
  )

  
}

export default App
