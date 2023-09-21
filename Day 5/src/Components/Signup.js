import React, { useState } from 'react';
import './Signup.css';

const LoginForm = () => {

  const [username, setUsername] = useState('');
  const [age, setAge] = useState('');
  const [phonenumber, setPhonenumber] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [confirmPassword, setConfirmPassword] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log('Username:', username);
    console.log('Age:', age);
    console.log('Phone number:', phonenumber);
    console.log('Email:', email);
    console.log('Password:', password);
    console.log('Confirm Password:', confirmPassword);

  };

  return (
    <div>
      <form className="login-forms" onSubmit={handleSubmit}>
        <p className="login-text">
          <span className="fa-stack fa-lg">
            <i className="fa fa-circle fa-stack-2x"></i>
            <i className="fa fa-lock fa-stack-1x"></i>
          </span>
        </p>
        <input
          type="username"
          className="login-username"
          autoFocus={true}
          required={true}
          placeholder="Username"
          value={username}
          onChange={(e) => setUsername(e.target.value)}
        />
        <input
          type="age"
          className="login-age"
          autoFocus={true}
          required={true}
          placeholder="Age"
          value={age}
          onChange={(e) => setAge(e.target.value)}
        />
        <input
          type="tel"
          className="login-phonenumber"
          autoFocus={true}
          required={true}
          placeholder="Phone Number"
          value={phonenumber}
          onChange={(e) => setPhonenumber(e.target.value)}
        />
        <input
          type="Email"
          className="login-Email"
          autoFocus={true}
          required={true}
          placeholder="Email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        />
        <input
          type="password"
          className="login-password"
          required={true}
          placeholder="Password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        <input
          type="password"
          className="login-confirmPassword"
          required={true}
          placeholder="Confirm Password"
          value={confirmPassword}
          onChange={(e) => setConfirmPassword(e.target.value)}
        />
        <input
          type="submit"
          name="Signup"
          value="Signup"
          className="login-submit"
        />
      </form>
      <div className="underlay-photo"></div>
      <div className="underlay-black"></div>
    </div>
  );
};

export default LoginForm;