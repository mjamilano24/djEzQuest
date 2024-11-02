import React from "react";
import Navbar from "./components/Navbar";
import Home from './components/pages/Home';
import Login from './components/pages/Login';
import Register from './components/pages/Register';
import DashBoard from "./components/pages/Dashboard";
import SongList from './components/SongList'; 
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import './App.css';

function App() {
    return (
        <>
            <Router>
                <Navbar />
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/login" element={<Login />} />
                    <Route path="/register" element={<Register />} />
                    <Route path="/dashboard" element={<DashBoard />} />
                </Routes>
            </Router>
        </>
    );
}

export default App;
