import React, {Component} from 'react'
import Card from '@material-ui/core/Card'
import CardActions from '@material-ui/core/CardActions'
import CardContent from '@material-ui/core/CardContent'
import CardMedia from '@material-ui/core/CardMedia'
import Button from '@material-ui/core/Button'
import Typography from '@material-ui/core/Typography'

const client = contentful.creatClient({
	space: SPACE_ID,
	accessToken: ACCESS_TOKEN;
})

class Course extends Component {
	state = {
		
	}
	
	constructor() {
		super()
		this.getProjects()
	}
	

	
	render() {
		<div>
			
		</div>
	}
	
}

export default Course;