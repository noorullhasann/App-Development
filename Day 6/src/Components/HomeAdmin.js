import NavbarAdmin from "./NavbarAdmin"
import * as React from 'react';
import './HomeAdmin.css';
import SidebarAdmin from "./SidebarAdmin";
import { PieChart } from '@mui/x-charts/PieChart';

export default function HomeSample() {
  return (
    <div>
    <SidebarAdmin/>
    <NavbarAdmin/>
    <div className="piechartAdmin">
    <PieChart 
  series={[
    {
      data: [
        { id: 0, value: 10, label: 'Melody', color:"rgb(87, 22, 126)" },
        { id: 1, value: 15, label: 'Rock', color:"rgb(155, 49, 146)" },
        { id: 2, value: 20, label: 'Others' , color:"rgb(112, 49, 172)9" },
      ],
    },
  ]}
  width={500}
  height={300}
/>
</div>
    </div>
  )
}