import Navbar from "./Navbar"
import * as React from 'react';
import './HomeSong.css';
import SidebarSong from "./SidebarSong";
import MusicPlayerSlider from "./MusicPlayer";


export default function HomeSample() {
  return (
    <div>
    <SidebarSong/>
    <Navbar/>
    <MusicPlayerSlider></MusicPlayerSlider>
    </div>
  )
}