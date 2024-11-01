import React from 'react';
import '../App.css';
import { Button } from './Button';
import './MainSection.css';

function MainSection() {
  return (
    <div className='main-container'>
      <video src='/videos/video-3.mp4' autoPlay loop muted />
      <h1>FIND YOUR EVENT</h1>
      <div className='main-btns'>
      <div className='input-areas'>
          <form>
            <input
              className='footer-input'
              name='eventId'
              type='eventId'
              placeholder='Event ID'
            />
            <Button buttonStyle='btn--outline'>Search</Button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default MainSection;