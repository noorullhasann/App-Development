import { useEffect, useRef, useState } from 'react';
import { Link, useLocation } from 'react-router-dom';
import './Sidebar.css';
import SearchIcon from '@mui/icons-material/Search';
import LibraryMusicIcon from '@mui/icons-material/LibraryMusic';
import HomeIcon from '@mui/icons-material/Home';
import SettingsIcon from '@mui/icons-material/Settings';
import QueueMusicIcon from '@mui/icons-material/QueueMusic';


import React, { Component } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { selectUser } from '../redux/userSliceSong';

class Sidebar extends Component {
  
  constructor(props) {
    super(props);

    this.state = {
      activeItem: 'dashboard', // Default active item
    };
  }

  handleItemClick = (itemName) => {
    this.setState({ activeItem: itemName });
  };

  render() {
    const { activeItem } = this.state;

    return (
      <div className="sidebar">
        <ul>
          <li
            className={activeItem === 'search' ? 'active' : ''}
            onClick={() => this.handleItemClick('search')}
          >
          <SearchIcon className='icon-e'></SearchIcon>
          Search
          </li>
          <li
            className={activeItem === 'Home' ? 'active' : ''}
            onClick={() => this.handleItemClick('home')}
          >
            <HomeIcon className='icon-h'></HomeIcon>
            Home
          </li>
          <li
            className={activeItem === 'Library' ? 'active' : ''}
            onClick={() => this.handleItemClick('library')}
          >
          <LibraryMusicIcon className='icon-l'></LibraryMusicIcon>
            Library
          </li>
          <div className='down'>
          <li
            className={activeItem === 'settings' ? 'active' : ''}
            onClick={() => this.handleItemClick('settings')}
          >
          <SettingsIcon className='icon-s'></SettingsIcon>
            Settings
          </li>
          <li
            className={activeItem === 'Account' ? 'active' : ''}
            onClick={() => this.handleItemClick('account')}
          >
          <QueueMusicIcon className='icon-a'/>
            Playlist
          </li>
          </div>
        </ul>
      </div>
    );
  }
}

export default Sidebar;
