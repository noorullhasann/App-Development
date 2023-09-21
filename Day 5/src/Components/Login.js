import React, { useState } from 'react';
import './Login.css';
import { useDispatch } from 'react-redux';
import { useNavigate } from 'react-router-dom';
import { login } from '../redux/userSliceSong';

const LoginForm = () => {
  const handleChange = (e) => {
    setFormdata({ ...formdata, [e.target.name]: e.target.value });
    console.log(formdata);
  };
  const [formdata, setFormdata] = useState({
    username: "",
    password: "",
  });
  const dispatch = useDispatch();
    const navigate=useNavigate();
    const handleSubmit = (e) => {
      e.preventDefault();
      if(formdata.username.length===0){
        alert("Enter Username!")
      }
      else if(formdata.password.length===0){
        alert("Enter Password!")
      }
   else{
      navigate("/Home");
   }
      dispatch(
        login({
          username: formdata.username,
        })
      );
    };
  return (
    <div>
      <form className="login-forml" >
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
          name="username"
          required={true}
          placeholder="Username"
          value={formdata.username}
          onChange={handleChange}
        />
        <input
          type="password"
          name='password'
          className="login-password"
          required={true}
          placeholder="Password"
          value={formdata.password}
          onChange={handleChange}
        />
        <input
          type="submit"
          name="Login"
          value="Login"
          className="login-submit"
          onClick={handleSubmit}
        />
      </form>
      <a href="#" className="login-forgot-pass">
        Sign Up
      </a>
      <div className="underlay-photo"></div>
      <div className="underlay-black"></div>
    </div>
  );
};

export default LoginForm;