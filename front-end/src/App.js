import React, { Component } from 'react';
import './App.css';
import { slide as Menu } from 'react-burger-menu';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
			<TopHeader/>
			<Projects/>
        </header>
      </div>
    );
  }
}

class TopHeader extends Component {
  render() {
    return (
      <div id="menu-bar" className="menu-bar">
	    <div class="header-name">
		  Jordan Posthauer
		</div>
		<Menu right>
		  <a id="home" className="menu-item" href="/">Home</a>
		  <a id="about" className="menu-item" href="/">About</a>
		  <a id="contact" className="menu-item" href="/">Contact</a>
		</Menu>	
      </div>
    );
  }
}

class Projects extends Component {
  render() {
    return (
      <div id="projects" class="app">
		<h2>
		  Projects:
		</h2>
      </div>
    );
  }
}

export default App;
