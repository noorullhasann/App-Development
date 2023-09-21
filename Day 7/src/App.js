import './App.css';
import HomeSample from './Components/HomeSample';
import Login from './Components/Login';
import { BrowserRouter as Router, Route, Switch, BrowserRouter, Routes } from 'react-router-dom';
import Signup from './Components/Signup';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Routes>
      <Route path='/' element={<Login/>}></Route>
     <Route path='/Signup' element={<Signup/>}></Route>
     <Route path='/Home' element={<HomeSample/>}></Route>
      </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
