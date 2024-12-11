import { useState } from 'react'
import axiosClient from './axiosClient'

const useAddCerveza = () => {
  const [nueva, setNueva] = useState(null)

  const addCerveza = async (cerveza) => {
    try {
        console.log(cerveza)
      const response = await axiosClient.post('/cerveza/nueva', cerveza)
      setNueva(response.data)
    } catch (error) {
      console.error('Error adding cerveza:', error)
    }
  }

  return { nueva, addCerveza }
}

export default useAddCerveza