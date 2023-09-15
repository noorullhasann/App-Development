import React, {useState } from 'react'
import { Link, useNavigate } from 'react-router-dom';
import './LoginS.css'

export default function LoginS() {

  
  const[username,setUsername]=useState("");
    const[password,setPassword]=useState("");
    const navigate=useNavigate();
    const formHandler=(event)=>{ 
      event.preventDefault();
      if(username.length===0){
        alert("Enter Username!")
      }
      else if(password.length===0){
        alert("Enter Password!")
      }
   else{
      navigate("/HomeS")
}}

  return (
    <div>
      <div className='Login'>
        <h2>Login</h2>
      </div>

      <label className='name' htmlFor="myInput"><h3>Username :</h3></label>
      <input className='namein' type="text" value={username} onChange={(e)=> setUsername(e.target.value)}  required />

      <label className='password' htmlFor="myInput"><h3>Password :</h3></label>
      <input className='passin' type="password" value={password} onChange={(e)=> setPassword(e.target.value)} required />

  <h3 onClick={formHandler} className='cont'>Continue</h3>
      <Link to="/SignupS"><h3 className='losign'>Sign Up!</h3></Link>
    </div>
  )
}
