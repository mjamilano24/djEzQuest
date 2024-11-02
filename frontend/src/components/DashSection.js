import React, { useEffect, useState } from 'react';
import SongList from './SongList'; // Import the SongList component

const DashSection = () => {
    const [songs, setSongs] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        const fetchSongs = async () => {
            try {
                const response = await fetch('http://localhost:8080/api/v1/song'); // Adjust the URL
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                const data = await response.json();
                setSongs(data);
            } catch (error) {
                setError(error.message);
            } finally {
                setLoading(false);
            }
        };

        fetchSongs();
    }, []);

    if (loading) {
        return <div>Loading...</div>;
    }

    if (error) {
        return <div>Error: {error}</div>;
    }

    return (
        <div>
            <h1>Song Dashboard</h1>
            <SongList songs={songs} /> {/* Use the SongList component */}
        </div>
    );
};

export default DashSection;