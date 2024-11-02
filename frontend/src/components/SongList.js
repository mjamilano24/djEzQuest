
import React from 'react';
import './SongList.css'; // Import the CSS file for styling

const SongList = ({ songs }) => {
    return (
        <table className="song-table">
            <thead>
                <tr>
                    <th>Request #</th>
                    <th>Title</th>
                    <th>Artist</th>
                    <th>Requested By</th>
                    <th>Request Time</th>
                </tr>
            </thead>
            <tbody>
                {songs.map((song, index) => (
                    <tr key={song.id}>
                        <td>{index + 1}</td> {/* Display the request number */}
                        <td>{song.title}</td>
                        <td>{song.artist}</td>
                        <td>{song.guestEmail}</td>
                        <td>{new Date(song.requestTimestamp).toLocaleString()}</td>
                    </tr>
                ))}
            </tbody>
        </table>
    );
};

export default SongList;