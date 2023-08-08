<template>
  <div class="home">
    <h1>Home</h1>
    <div class="box1" id="box" label="my-songs">
      <h2 class="my-songs-header">My Songs</h2>
      <h3>Genre:
        <select name="genre" id="genre-dropdown">Genre
          <option value="rock" id="genre-dropdown">Rock</option>
          <option value="hip-hop" id="genre-dropdown">Hip-Hop</option>
          <option value="jazz" id="genre-dropdown">Jazz</option>
          <option value="electric" id="genre-dropdown">Electric</option>
          <option value="country" id="genre-dropdown">Country</option>
          <option value="classical" id="genre-dropdown">Classical</option>
          <option value="pop" id="genre-dropdown">Pop</option>
          <option value="folk" id="genre-dropdown">Folk</option>
          <option value="musical-theatre" id="genre-dropdown">Musical Theatre</option>
        </select>
      </h3>
      <h4>Artist</h4>
      <h4>Title</h4>
      <h4>Album</h4>
      <h4>Year</h4>
    </div>
    <div class="box2" id="box" label="discover-music">
      <h2 class="discover-header">Discover New Music</h2>
      <div class="genre-container">
        <button class="genre-btn">Rock</button>
        <button class="genre-btn">Hip-Hop</button>
        <button class="genre-btn">Jazz</button>
        <button class="genre-btn">Electronic</button>
        <button class="genre-btn">Country</button>
        <button class="genre-btn">Classical</button>
        <button class="genre-btn">Pop</button>
        <button class="genre-btn">Folk</button>
        <button class="genre-btn">Musical Theatre</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "home"
};
</script>

<style scoped>

</style>