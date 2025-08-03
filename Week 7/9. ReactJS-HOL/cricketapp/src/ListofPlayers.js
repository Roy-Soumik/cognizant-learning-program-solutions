import React from "react";

function ListofPlayers() {
  const players = [
    { name: "Jack", score: 70 },
    { name: "Arnold", score: 60 },
    { name: "Alex", score: 81 },
    { name: "Chris", score: 51 },
    { name: "Stokes", score: 91 },
    { name: "Gill", score: 65 },
    { name: "Mahi", score: 98 },
    { name: "Rahul", score: 78 },
    { name: "Kohli", score: 33 },
    { name: "Ash", score: 81 },
    { name: "Jadeja", score: 61 },
  ];

  const players70 = [];
  players.map((item) => {
    if (item.score < 70) {
      players70.push(item);
    }
  });

  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {players.map((item) => {
          return (
            <div>
              <li>
                Mr. <span>{item.name}</span> - <span>{item.score}</span>
              </li>
            </div>
          );
        })}
      </ul>

      <h2>List of Players having Scores Less than 70</h2>
      <ul>
        {players70.map((item) => {
          return (
            <div>
              <li>
                Mr. <span>{item.name}</span> - <span>{item.score}</span>
              </li>
            </div>
          );
        })}
      </ul>
    </div>
  );
}

export default ListofPlayers;
