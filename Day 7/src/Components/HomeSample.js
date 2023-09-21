import Sidebar from "./Sidebar"
import * as React from 'react';
import Button from '@mui/material/Button';
import Menu from '@mui/material/Menu';
import MenuItem from '@mui/material/MenuItem';
import PopupState, { bindTrigger, bindMenu } from 'material-ui-popup-state';
import './HomeSample.css';
import DashboardIcon from '@mui/icons-material/Dashboard';
import Navbar from './Navbar';

export default function HomeSample() {
  return (
    <div>
    <Sidebar/>
    <Navbar/>
    </div>
  )
}