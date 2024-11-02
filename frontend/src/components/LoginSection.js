import React from "react";
import './LoginSection.css';
import Footer from "./Footer";
import { Button } from './Button';
import { FaUser, FaLock } from "react-icons/fa";
import {Link} from 'react-router-dom';

const LoginSection = () => {
    return(
        <div className='wrapper'>
            <video src='/videos/video-3.mp4' autoPlay loop muted />
            <form action="">
                <h1>DJ Login</h1>
                <div className="input-box">
                    <input type="text" placeholder='Username' required />
                    <FaUser className='icon'/>
                </div>
                <div className="input-box">
                    <input type="password" placeholder='Password' required />
                    <FaLock className='icon'/>
                </div>

                <div className="remember-forgot">
                    <label><input type="checkbox"></input>Remember Me</label>
                    <a href="#">Forgot Password</a>
                </div>

                <button type="submit">Login</button>

                <div className="register-link">
                    <p>Don't have an account? <Link to="/register">Register</Link></p>
                </div>

            </form>
        </div>
    )
}

export default LoginSection;