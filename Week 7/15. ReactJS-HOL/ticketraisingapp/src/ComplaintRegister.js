import React from 'react';

class ComplaintRegister extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      ename: '',
      complaint: '',
      NumberHolder: Math.floor(Math.random() * 1000)
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({ [event.target.name]: event.target.value });
  }

  handleSubmit(event) {
    const msg =
      'Thanks ' + this.state.ename + '\n' +
      'Your Complaint was Submitted.\n' +
      'Transaction ID is: ' + this.state.NumberHolder;
    alert(msg);
    event.preventDefault();
  }

  render() {
    const containerStyle = {
      width: '400px',
      margin: '50px auto',
      textAlign: 'left',
      fontFamily: 'Arial, sans-serif'
    };
    const headerStyle = {
      textAlign: 'center',
      color: 'red'
    };
    const labelStyle = {
      display: 'block',
      margin: '10px 0 5px'
    };
    const inputStyle = {
      width: '100%',
      padding: '5px'
    };
    const buttonStyle = {
      marginTop: '10px'
    };

    return (
      <div style={containerStyle}>
        <h2 style={headerStyle}>Register your complaints here!!!</h2>
        <form onSubmit={this.handleSubmit}>
          <label style={labelStyle}>Name:</label>
          <input
            type="text"
            name="ename"
            value={this.state.ename}
            onChange={this.handleChange}
            style={inputStyle}
          />

          <label style={labelStyle}>Complaint:</label>
          <textarea
            name="complaint"
            value={this.state.complaint}
            onChange={this.handleChange}
            rows="4"
            style={inputStyle}
          />

          <button type="submit" style={buttonStyle}>Submit</button>
        </form>
      </div>
    );
  }
}

export default ComplaintRegister;
