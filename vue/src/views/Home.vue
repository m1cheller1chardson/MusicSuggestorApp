<template>
  <div class="home">
    <h1>Home</h1>
    <div class="box-1" id="box" label="my-songs">
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
    <div class="box-2" id="box" label="discover-music">
      <h2>Discover New Music</h2>
      <button>Rock</button>
      <button>Hip-Hop</button>
      <button>Jazz</button>
      <button>Electronic</button>
    </div>



  </div>
</template>

<script>
export default {
  name: "home"
};
</script>

<style>
* {
  position: center
}
</style>