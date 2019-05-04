import React, { Component } from 'react';
import { withStyles } from '@material-ui/core/styles';

export default function Project(props) {
	var img: '/static/images/bark_sensor/schematic.jpg';
	return (
		<div class='row'>
		  <div class='side'>
		    {props.title}
		    {props.desc}
		  </div>
		  <div class='imgContainer'>
		  	{props.img}
		  </div>
		</div>
	);
}