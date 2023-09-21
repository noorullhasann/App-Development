import { configureStore } from "@reduxjs/toolkit";
import userReducer from "../redux/userSliceSong"; 

const store = configureStore({
  reducer: {
    user: userReducer, 
  },
});

export default store;