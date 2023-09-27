import React, { Component } from 'react';
import DashboardIcon from '@mui/icons-material/Dashboard';
import PlaylistAddIcon from '@mui/icons-material/PlaylistAdd';
import QueueMusicIcon from '@mui/icons-material/QueueMusic';
import SettingsIcon from '@mui/icons-material/Settings';
import "./SidebarAdmin.css"

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
      <div className="adsidebar">
        <ul>
          <li
            className={activeItem === 'dashboard' ? 'active' : ''}
            onClick={() => this.handleItemClick('dashboard')}
          >
          <DashboardIcon className='adDash-icon'/>
            Dashboard
          </li>
          <li
            className={activeItem === 'playlist' ? 'active' : ''}
            onClick={() => this.handleItemClick('playlists')}
          >
          <PlaylistAddIcon className='adplaylist-icon'/>
            Playlist Created
          </li>
          <li
            className={activeItem === 'likes' ? 'active' : ''}
            onClick={() => this.handleItemClick('likes')}
          >
          <QueueMusicIcon className='adlike-icon'/>
            Songs
          </li>

          <div className='adSettingside'>
          <li
            className={activeItem === 'settings' ? 'active' : ''}
            onClick={() => this.handleItemClick('settings')}
          >
          <SettingsIcon className='adsetting-icon'/>
            Settings
          </li>
          </div>
        </ul>
      </div>
    );
  }
}

export default Sidebar;
