<template>
  <div id="app">
    <div id="nav">
      <router-link v-bind:to="{ name: 'home' }" class="home-btn">Home</router-link>&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
    </div>
    <router-view />
  </div>
</template>

<style>
/* HEADERS */
.my-songs-header {
  background-color: #757047;
}

.discover-header {
  background-color: #C5A491;
}

h2 {
  vertical-align: center;
  text-align: center;
}

h3 {
  background-color: #757047;
  margin-left: 40px;
}

h4 {
  background-color: #757047;
  margin-left: 55px;
  margin-bottom: 60p
}

* {
  background-color: #D5D9D8;
  font-family: Arial;
  font-style: normal;
  color: #F0EBF4;
}

/* BUTTONS */
.btn {
  color: white;
  background-color: black;
  border-radius: 20%;
  position: center;
  padding: 4px;
}

.home-btn {
  color: white;
  text-decoration: none;
}

#genre-dropdown {
  background-color: #B6B19E;
  border-radius: 5px;
  margin-left: 75px;
}

.genre-btn {
  background-color: #B6B19E;
  border-color: white;
  width: 95%;
  padding: 50px 30px 50px 30px;
  /* margin: 10px 10px; */
  border-radius: 10px;
  text-align: center;
  vertical-align: middle;

}

/* CONTAINERS */
.my-songs {
  border: 2px solid #B6B19E;
  border-radius: 10px;
  background-color: #757047;
  color: #F0EBF4;
  justify-content: center;
  height: 97%;
  width: 97%;
}

.discover-music {
  border: 2px solid #F0E3D2;
  border-radius: 10px;
  background-color: #C5A491;
  color: #F0EBF4;
  margin-top: 25px;
  height: 100%;
  width: 97%;
}

.genre-container {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;
  grid-template-rows: 1fr 1fr 1fr;
  background-color: #C5A491;
  padding: 0px 10px 0px 10px;
  grid-row-gap: 10px;
  justify-items: center;
}

.home {
  display: grid;
  grid-template-columns: 1fr;
  grid-template-rows: 1fr;
  grid-template-areas:
    "box1"
    "box2";
  place-items: center;
}
</style>

