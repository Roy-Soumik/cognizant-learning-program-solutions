import React from "react";

class CountPeople extends React.Component {
  constructor() {
    super();
    this.state = {
      entrycount: 0,
      exitcount: 0,
      c: 0
    };
  }

  updateEntry() {
    this.setState((prevState, props) => {
      return { entrycount: prevState.entrycount + 1 };
    });
  }

  updateExit() {
    this.setState((prevState, props) => {
      return { exitcount: prevState.exitcount + 1 };
    });
  }

  render() {
    return (
      <div className="counter-container">
  <div className="counter-section">
    <button className="counter-btn" onClick={() => this.updateEntry()}>
      Login
    </button>
    &nbsp; {this.state.entrycount} People Entered!!!
  </div>
  <div className="counter-section">
    <button className="counter-btn" onClick={() => this.updateExit()}>
      Exit
    </button>
    &nbsp; {this.state.exitcount} People Left!!!
  </div>
</div>
    );
  }
}

export default CountPeople;
