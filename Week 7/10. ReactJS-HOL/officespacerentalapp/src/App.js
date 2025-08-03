import React from 'react';
import officeImg from './office.jpg';

function App() {
  const office = {
    Name: 'DBS',
    Rent: 50000,
    Address: 'Chennai'
  };

  const offices = [
    office,
    { Name: 'CapitaBay', Rent: 70000, Address: 'Bangalore' },
    { Name: 'TechPark', Rent: 55000, Address: 'Mumbai' }
  ];

  return (
    <div style={{ textAlign: 'center', fontFamily: 'Arial, sans-serif' }}>
      <h1>Office Space, at Affordable Range</h1>

      <img src={officeImg} alt="Office Space" width="300" />

      {offices.map((item, idx) => {
        const rentColor = item.Rent < 60000 ? 'red' : 'green';

        return (
          <div key={idx} style={{ marginTop: '20px' }}>
            <h2>Name: {item.Name}</h2>
            <h3 style={{ color: rentColor }}>
              Rent: Rs. {item.Rent}
            </h3>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;
