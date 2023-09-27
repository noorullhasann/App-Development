import React, { useState } from 'react';
import NavbarAdmin from "./NavbarAdmin"
import "./AdminHome.css";

const MusicPlayer = () => {
  const [playlist, setPlaylist] = useState([]);
  const [currentSong, setCurrentSong] = useState(null);

  const addSong = (song) => {
    setPlaylist([...playlist, song]);
  };

  const deleteSong = (index) => {
    const updatedPlaylist = [...playlist];
    updatedPlaylist.splice(index, 1);
    setPlaylist(updatedPlaylist);
  };

  const playSong = (song) => {
    setCurrentSong(song);
  };

  return (
    <div>
    <NavbarAdmin/>
    <div className="hmusic-player">
      <h1 className='hmusic'>Music Player</h1>
      <div className="hplaylist">
        <h2 className='hplay'>Playlist</h2>
        <ul>
          {playlist.map((song, index) => (
            <li key={index}>
              {song.title} - {song.artist}
              <button onClick={() => deleteSong(index)}>Delete</button>
              <button onClick={() => playSong(song)}>Play</button>
            </li>
          ))}
        </ul>
      </div>
      <div className="hcurrent-song">
        <h2 >Current Song</h2>
        {currentSong ? (
          <div className='hp'>
            <p>{currentSong.title}</p>
            <p>{currentSong.artist}</p>
          </div>
        ) : (
          <p className='hp'>No song is currently playing.</p>
        )}
      </div>
      <div className="hadd-song">
        <h2>Add a Song</h2>
        <button
          onClick={() =>
            addSong({ title: 'Song Title', artist: 'Artist Name' })
          }
        >
          Add Song
        </button>
      </div>
    </div>
    </div>
  );
};

export default MusicPlayer;
