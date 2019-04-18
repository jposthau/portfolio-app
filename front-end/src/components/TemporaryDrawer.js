import React from 'react';
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
import Drawer from '@material-ui/core/Drawer';
import List from '@material-ui/core/List';
import ListItem from '@material-ui/core/ListItem';
import ListItemIcon from '@material-ui/core/ListItemIcon';
import ListItemText from '@material-ui/core/ListItemText';
import HomeIcon from '@material-ui/icons/Home';
import MailIcon from '@material-ui/icons/Mail';
import DocIcon from '@material-ui/icons/FileCopy';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import IconButton from '@material-ui/core/IconButton';
import MenuIcon from '@material-ui/icons/Menu';

const styles = {
  list: {
    width: 250,
  },
  fullList: {
    width: 'auto',
  },
  root: {
    flexGrow: 1,
  },
  menuButton: {
    marginLeft: 'auto',
	marginRight: -18,
	
  },
};

class TemporaryDrawer extends React.Component {
  state = {
    top: false,
    left: false,
    bottom: false,
    right: false,
  };

  toggleDrawer = (side, open) => () => {
    this.setState({
      [side]: open,
    });
  };

  render() {
    const { classes } = this.props;

    const sideList = (
      <div className={classes.list}>
        <List>
          {['Home', 'Resume', 'Contact Me'].map((text, index) => (
			<a href={	index === 2 ? "/contact":
						index === 1 ? "/resume" : "/"}>
            <ListItem button key={text} >
				<ListItemIcon>{	index === 0 ? 	<HomeIcon /> : 
								index === 1 ? 	<DocIcon /> : 
												<MailIcon />}
				</ListItemIcon>
				<ListItemText primary={text} />
            </ListItem>
			</a>
          ))}
        </List>
      </div>
    );

    return (
      <div>
		<div className={classes.root}>
			<AppBar position="static">
				<Toolbar variant="dense">
					<Typography variant="h6" color="inherit">
						Jordan Posthauer
					</Typography>
					<IconButton className={classes.menuButton} color="inherit" aria-label="Menu"
					onClick={this.toggleDrawer('right', true)}>
						<MenuIcon/>
					</IconButton>
				</Toolbar>
			</AppBar>
		</div>
        <Drawer anchor="right" open={this.state.right} onClose={this.toggleDrawer('right', false)}>
          <div
            tabIndex={0}
            role="button"
            onClick={this.toggleDrawer('right', false)}
            onKeyDown={this.toggleDrawer('right', false)}
          >
            {sideList}
          </div>
        </Drawer>
      </div>
    );
  }
}

TemporaryDrawer.propTypes = {
  classes: PropTypes.object.isRequired,
};

export default withStyles(styles)(TemporaryDrawer);