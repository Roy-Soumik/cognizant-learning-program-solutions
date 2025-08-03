import { useState } from 'react'
import CurrencyConvertor from './CurrencyConvertor'

function App() {
  const [count, setCount] = useState(0)

  const increment = () => {
    setCount(c => c + 1)
    alert('Hello from Increment!')
  }

  const decrement = () => {
    setCount(c => c - 1)
  }

  const sayWelcome = () => {
    alert('welcome')
  }

  const handlePress = () => {
    alert('I was clicked')
  }

  return (
    <div style={{ padding: 20 }}>
      <p>{count}</p>
      <button onClick={increment}>Increment</button>
      <br />
      <button onClick={decrement}>Decrement</button>
      <br />
      <button onClick={sayWelcome}>Say welcome</button>
      <br />
      <button onClick={handlePress}>Click on me</button>

      <CurrencyConvertor />
    </div>
  )
}

export default App
