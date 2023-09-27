import './App.css';
import { BrowserRouter , Route , Routes } from 'react-router-dom';
import HomeSong from "./Components/HomeSong"
import HomeAdmin from "./Components/HomeAdmin"
import LoginSong from "./Components/LoginSong"

function App() {
  return (
    <div className="App">
    <BrowserRouter>
    <Routes>
    <Route path="/" element={<LoginSong/>}></Route>
    <Route path="/HomeSong" element={<HomeSong/>}></Route>
    <Route path="/HomeAdmin" element={<HomeAdmin/>}></Route>
    </Routes>
    </BrowserRouter>
    </div>
  );
}

export default App;
