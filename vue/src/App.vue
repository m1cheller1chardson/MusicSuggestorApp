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

</style>

