import React, { Component } from 'react';
import DashboardIcon from '@mui/icons-material/Dashboard';
import PlaylistAddIcon from '@mui/icons-material/PlaylistAdd';
import FavoriteIcon from '@mui/icons-material/Favorite';
import SettingsIcon from '@mui/icons-material/Settings';
import "./SidebarSong.css"

class Sidebar extends Component {
  constructor(props) {
    super(props);

    this.state = {
      activeItem: 'dashboard', // Default active item
    };
  }

  // Function to handle sidebar item clicks
  handleItemClick = (itemName) => {
    this.setState({ activeItem: itemName });
  };

  render() {
    const { activeItem } = this.state;

    return (
      <div className="sidebar">
        <ul>
          <li
            className={activeItem === 'dashboard' ? 'active' : ''}
            onClick={() => this.handleItemClick('dashboard')}
          >
          <DashboardIcon className='Dash-icon'/>
            Dashboard
          </li>
          <li
            className={activeItem === 'playlist' ? 'active' : ''}
            onClick={() => this.handleItemClick('playlists')}
          >
          <PlaylistAddIcon className='playlist-icon'/>
            Playlist
          </li>
          <li
            className={activeItem === 'likes' ? 'active' : ''}
            onClick={() => this.handleItemClick('likes')}
          >
          <FavoriteIcon className='like-icon'/>
            Likes
          </li>
          
          <div className='Settingside'>
          <li
            className={activeItem === 'settings' ? 'active' : ''}
            onClick={() => this.handleItemClick('settings')}
          >
          <SettingsIcon className='setting-icon'/>
            Settings
          </li>
          </div>
          
        </ul>
      </div>
    );
  }
}

export default Sidebar;
