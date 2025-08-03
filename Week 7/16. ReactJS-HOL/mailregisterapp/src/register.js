import React from 'react';

class Register extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      fullName: '',
      email: '',
      password: '',
      errors: {
        fullName: '',
        email: '',
        password: ''
      }
    };
  }

  validateField(name, value) {
    const errors = { ...this.state.errors };
    switch (name) {
      case 'fullName':
        errors.fullName =
          value.length < 5
            ? 'Full Name must be 5 characters long!'
            : '';
        break;
      case 'email':
        const validEmailRegex = RegExp(
          /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@(([^<>()[\]\\.,;:\s@"]+\.)+[^<>()[\]\\.,;:\s@"]{2,})$/
        );
        errors.email = validEmailRegex.test(value)
          ? ''
          : 'Email is not valid!';
        break;
      case 'password':
        errors.password =
          value.length < 8
            ? 'Password must be 8 characters long!'
            : '';
        break;
      default:
        break;
    }
    this.setState({ errors });
  }

  handleChange = (event) => {
    const { name, value } = event.target;
    this.setState(
      { [name]: value },
      () => this.validateField(name, value)
    );
  };

  validateForm(errors) {
    return Object.values(errors).every((err) => err === '');
  }

  handleSubmit = (event) => {
    event.preventDefault();
    const { errors, fullName, email, password } = this.state;
    if (this.validateForm(errors)) {
      alert('Valid Form');
    } else {
      if (errors.fullName) alert(errors.fullName);
      if (errors.email)    alert(errors.email);
      if (errors.password) alert(errors.password);
    }
  };

  render() {
    const container = { width: '300px', margin: '50px auto', fontFamily: 'Arial' };
    const header    = { textAlign: 'center', color: 'red' };
    const label     = { display: 'block', marginTop: '10px' };
    const input     = { width: '100%', padding: '5px' };
    const button    = { marginTop: '15px' };

    return (
      <div style={container}>
        <h2 style={header}>Register Here!!!</h2>
        <form onSubmit={this.handleSubmit}>
          <label style={label}>Name:</label>
          <input
            type="text"
            name="fullName"
            value={this.state.fullName}
            onChange={this.handleChange}
            style={input}
          />

          <label style={label}>Email:</label>
          <input
            type="text"
            name="email"
            value={this.state.email}
            onChange={this.handleChange}
            style={input}
          />

          <label style={label}>Password:</label>
          <input
            type="password"
            name="password"
            value={this.state.password}
            onChange={this.handleChange}
            style={input}
          />

          <button type="submit" style={button}>Submit</button>
        </form>
      </div>
    );
  }
}

export default Register;
