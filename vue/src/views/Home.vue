<template>
  <div class="home">
    <h1>Home</h1>
    <div class="box1" id="box" label="my-songs">
      <h2>My Songs</h2>
      <h3>Genre:
        <select name="genre" class="genre">Genre
          <option value="rock">Rock</option>
          <option value="hip-hop">Hip-Hop</option>
          <option value="jazz">Jazz</option>
          <option value="electric">Electric</option>
          <option value="country">Country</option>
          <option value="classical">Classical</option>
          <option value="pop">Pop</option>
          <option value="folk">Folk</option>
          <option value="musical-theatre">Musical Theatre</option>
        </select>
      </h3>
      <h4>Artist</h4>
      <h4>Title</h4>
      <h4>Album</h4>
      <h4>Year</h4>
    </div>
    <div class="box2" id="box" label="discover-music">
      <h2>Discover New Music</h2>
      <button class="genre-btn">Rock</button> &nbsp;
      <button class="genre-btn">Hip-Hop</button><br>
      <button class="genre-btn">Jazz</button> &nbsp;
      <button class="genre-btn">Electronic</button><br>
      <button class="genre-btn">Country</button> &nbsp;
      <button class="genre-btn">Classical</button><br>
      <button class="">Pop</button> &nbsp;
      <button class="">Folk</button><br>
      <button class="">Musical Theatre</button> &nbsp;
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