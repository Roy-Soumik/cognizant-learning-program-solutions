import React from 'react';

class Getuser extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      person: null,
      loading: true
    };
  }

  async componentDidMount() {
    const url = 'https://api.randomuser.me/';
    const response = await fetch(url);
    const data = await response.json();
    this.setState({
      person: data.results[0],
      loading: false
    });
  }

  render() {
    const container = {
      textAlign: 'center',
      marginTop: '50px',
      fontFamily: 'Arial, sans-serif'
    };
    const nameStyle = { fontSize: '24px', marginBottom: '20px' };
    const imgStyle = { borderRadius: '4px' };

    if (this.state.loading) {
      return <div style={container}>Loading...</div>;
    }

    const { title, first } = this.state.person.name;
    const imgSrc = this.state.person.picture.medium;

    return (
      <div style={container}>
        <div style={nameStyle}>
          {title} {first}
        </div>
        <img src={imgSrc} alt="User" style={imgStyle} />
      </div>
    );
  }
}

export default Getuser;
