import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import LoginS from './Components/LoginS';
import SignupS from './Components/SignupS'
import HomeS from './Components/HomeS';

function App() {
  return (
    <BrowserRouter>
     <Routes>
     <Route path='/' element={<LoginS/>}></Route>
     <Route path='/SignupS' element={<SignupS/>}></Route>
     <Route path='/HomeS' element={<HomeS/>}></Route>
     </Routes>
     </BrowserRouter>
  );
}

export default App;
