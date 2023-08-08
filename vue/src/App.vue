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
* {
  background-color: #ACD5E6;
  font-family: Arial;
  font-style: normal;
}

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

.purp-btn {
  background-color: #B39BC8;
}

.box1 {
  border: 2px solid #669bb7;
  background-color: #B39BC8;
  justify-content: center;
  height: 97%;
  width: 97%;
}

.box2 {
  border: 2px solid #669bb7;
  background-color: #e64398;
  height: 97%;
  width: 97%;
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

