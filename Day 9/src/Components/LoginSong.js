import React, { useState } from 'react';
import { useDispatch } from "react-redux";
import { useNavigate } from "react-router-dom";
import { login } from "../redux/userSliceSong";
import './LoginSong.css'; 

const YourComponent = () => {

  const handleChange = (e) => {
    setFormdata({ ...formdata, [e.target.name]: e.target.value });
    console.log(formdata);
  };
  const [formdata, setFormdata] = useState({
    username: "",
    password: "",
  });
  const NavSignUp=()=>
  {
    navigate('/Signup')
  }
  const NavAdmin=()=>
  {
    navigate('/HomeAdmin')
  }
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
      navigate("/HomeSong");
   }
      dispatch(
        login({
          username: formdata.username,
        })
      );
    };
    const handleAdmin = (e) => {
      e.preventDefault();
      if(formdata.username.length===0){
        alert("Enter AdminUsername!")
      }
      else if(formdata.password.length===0){
        alert("Enter AdminPassword!")
      }
   else{
      navigate("/HomeAdmin");
   }
      dispatch(
        login({
          username: formdata.username,
        })
      );
    };
    
  return (
    <div> 
    <img className='login-bg' src="https://cdn.create.vista.com/api/media/small/446559348/stock-photo-music-background-concept-notes-rendering" alt='Background'></img>
    <div className="login-box">
      <h2>Login</h2>
      <form>
        <div className="user-box">
          <input type="text" name="username" required value={formdata.username}
          onChange={handleChange} />
          <label>Username</label>
        </div>
        <div className="user-box">
          <input type="password" name="password" required value={formdata.password}
          onChange={handleChange} />
          <label>Password</label>
        </div>
        <a className='submitp-song' onClick={handleSubmit}>
          <span></span>
          <span></span>
          <span></span>
          <span></span>
          Submit
        </a>
        <a className='Signupp-song' onClick={NavSignUp}>
          <span></span>
          <span></span>
          <span></span>
          <span></span>
          SignUp!!
        </a>
        <a className='Admin-Loginbt' onClick={handleAdmin}>
          <span></span>
          <span></span>
          <span></span>
          <span></span>
          Admin
        </a>
        </form>
    </div>
    </div>
  );
};

export default YourComponent;
