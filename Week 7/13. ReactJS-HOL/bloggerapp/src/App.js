
import React from 'react';
import './App.css';
import { books, blog, install, courses } from './data';

function App() {
  const bookdet = (
    <ul>
      {books.map(b => (
        <div key={b.id}>
          <h3>{b.bname}</h3>
          <h4>{b.price}</h4>
        </div>
      ))}
    </ul>
  );

  const content = (
    <div>
      <h2>{blog.title}</h2>
      <p><strong>{blog.author}</strong></p>
      <p>{blog.content}</p>
      {install.title && (
        <>
          <h2>{install.title}</h2>
          <p><strong>{install.author}</strong></p>
          <p>{install.content}</p>
        </>
      )}
    </div>
  );

  const coursedet = (
    <ul>
      {courses && courses.map(c => (
        <div key={c.id}>
          <h3>{c.name}</h3>
          <p>{c.date}</p>
        </div>
      ))}
    </ul>
  );

  return (
    <div className="container">
      <div className="box">
        <h1>Book Details</h1>
        {bookdet}
      </div>
      <div className="box">
        <h1>Blog Details</h1>
        {content}
      </div>
      <div className="box">
        <h1>Course Details</h1>
        {coursedet}
      </div>
    </div>
  );
}

export default App;
