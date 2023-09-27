import Navbar from "./Navbar"
import SidebarSong from "./SidebarSong"
import * as React from 'react';
import './HomeSong.css';
import Footer from "./Footer";
import MusicPlayerSlider from "./MusicPlayer";
export default function HomeSample() {
  return (
    <div>
    <Navbar/> 
    <SidebarSong/>
    <Footer/>
    <MusicPlayerSlider/>
    </div>
  )
}