import { useState } from 'react'

export default function CurrencyConvertor() {
  const [amount, setAmount] = useState('')
  const [currency, setCurrency] = useState('')

  const handleSubmit = e => {
    e.preventDefault()
 
    if (currency.toLowerCase() === 'euro') {
      const result = amount * 80
      alert(`Converting to Euro Amount is ${result}`)
    }
  }

  return (
    <div style={{ marginTop: 40 }}>
      <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
      <form onSubmit={handleSubmit}>
        <label>
          Amount:
          <input
            type="number"
            value={amount}
            onChange={e => setAmount(e.target.value)}
            style={{ marginLeft: 8 }}
          />
        </label>
        <br />
        <label>
          Currency:
          <textarea
            rows="2"
            cols="15"
            value={currency}
            onChange={e => setCurrency(e.target.value)}
            style={{ verticalAlign: 'middle', marginLeft: 8 }}
          />
        </label>
        <br />
        <button type="submit">Submit</button>
      </form>
    </div>
  )
}
