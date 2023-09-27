import './App.css';
import { BrowserRouter , Route , Routes } from 'react-router-dom';
import HomeSong from "./Components/HomeSong"
import Signup from "./Components/Signup"
import AdminHome from "./Components/AdminHome"
import LoginSong from "./Components/LoginSong"
import MusicSettings from './Components/Settings';
import Aboutus from './Components/Aboutus';
import Privacy from './Components/Privacy';
import Terms from './Components/Terms';
import FAQ from './Components/FAQ';
import Playlist from './Components/Playlist/Playlist';

function App() {
  return (
    <div className="App">
    <BrowserRouter>
    <Routes>
    <Route path="/" element={<LoginSong/>}></Route>
    <Route path='/Signup' element={<Signup/>}></Route>
    <Route path="/HomeSong" element={<HomeSong/>}></Route>
    <Route path="/HomeAdmin" element={<AdminHome/>}></Route>
    <Route path="/Settings" element={<MusicSettings/>}></Route>
    <Route path='/about' element={<Aboutus/>}></Route>
    <Route path='/privacy' element={<Privacy/>}></Route>
    <Route path='/terms' element={<Terms/>}></Route>
    <Route path='/faq' element={<FAQ/>}></Route>
    <Route path='/playlist' element={<Playlist/>}></Route>
    </Routes>
    </BrowserRouter>
    </div>
  );
}

export default App;
