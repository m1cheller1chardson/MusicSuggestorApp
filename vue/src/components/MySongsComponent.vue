<template>
    <div class="my-songs">
        <h2 class="my-songs-header">My Songs</h2>
        <h3>Genre:
            <!-- Dynamically search My Songs by genre -->
            <select name="genre" id="genre-dropdown">Genre
                <option value="rock" id="genre-dropdown">Rock</option>
                <option value="hip-hop" id="genre-dropdown">Hip-Hop</option>
                <option value="jazz" id="genre-dropdown">Jazz</option>
                <option value="electronic" id="genre-dropdown">Electronic</option>
                <option value="country" id="genre-dropdown">Country</option>
                <option value="classical" id="genre-dropdown">Classical</option>
                <option value="pop" id="genre-dropdown">Pop</option>
                <option value="folk" id="genre-dropdown">Folk</option>
                <option value="musical-theatre" id="genre-dropdown">Musical Theatre</option>
            </select>
        </h3>
        <h4>Artist: {{ song.artist }}</h4>
        <h4>Title: {{ song.title }}</h4>
        <h4>Album: {{ song.album }}</h4>
        <h4>Year: {{ song.year }}</h4>
    </div>
</template>

<script>
export default {
    name: "mySongs",
    data() {
        return {
            favorited: false,
            song: {
                genre: '',
                artist: '',
                title: '',
                album: '',
                year: ''
            }
        }
    }
}
</script>

<style></style>