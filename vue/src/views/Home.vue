<template>
  <div class="home">
    <h1>Home</h1>
    <my-songs-component/>
    <discover-new-music-component/>
    
  </div>
</template>

<script>
import DiscoverNewMusicComponent from '../components/DiscoverNewMusicComponent.vue';
import MySongsComponent from '../components/MySongsComponent.vue';

export default {
  components: {
    MySongsComponent,
    DiscoverNewMusicComponent
  },
  name: "home"
};
</script>

<style scoped>

</style>