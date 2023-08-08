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
  background-color: #B39BC8;
}

.discover-header {
  background-color: #e64398;
}

h3 {
  background-color: #B39BC8;
}

h4 {
  background-color: #B39BC8;
}

* {
  background-color: #ACD5E6;
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
  background-color: #F172a1;
}

/* CONTAINERS */
.box1 {
  border: 2px solid #669bb7;
  background-color: #B39BC8;
  color: #F0EBF4;
  justify-content: center;
  height: 97%;
  width: 97%;
}

.box2 {
  border: 2px solid #669bb7;
  background-color: #e64398;
  color: #F0EBF4;
  height: 97%;
  width: 97%;
}

/* GENRE BUTTONS */
.genre-btn {
  display: flex;
  justify-content: space-between;
  background-color: #B39BC8;
  width: 95%;
  padding: 20px 100px 40px 30px;
  margin: 10px 5px;
  text-align: center;
  vertical-align: text-top;
}

.genre-container {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;
  grid-template-rows: 1fr 1fr 1fr;
  background-color: #e64398;
  
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

